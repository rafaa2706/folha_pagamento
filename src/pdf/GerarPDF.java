/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdf;

import classes.Dependente;
import classes.Colaborador;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import utils.Constantes;

/**
 *
 * @author 1_DEV
 */
public class GerarPDF {
    
    // Método para gerar o PDF ao clicar no botão
    public void gerarFolhaPagamentoPDF(Colaborador colaborador, List<Dependente> dependentes) {
    PDDocument document = new PDDocument();
    
    try {
        if (colaborador == null) {
            System.out.println("Colaborador não encontrado!");
            return;
        }

        // Carregar a fonte para o PDF
        PDFont font = PDType0Font.load(document, new File("src/fonts/arial.ttf"));
        
        // Criar uma nova página para o PDF
        PDPage page = new PDPage();
        document.addPage(page);
        
        

        // Criar o conteúdo do PDF
        try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) { 
            contentStream.setFont(font, 12);
            contentStream.beginText();
            contentStream.newLineAtOffset(100, 700);

            // Título do PDF
            contentStream.showText("Folha de Pagamento");
            contentStream.newLineAtOffset(0, -20);
            
            // Dados da Empresa
            //contentStream.showText("Nome: " + colaborador.getId_empresa());
            //contentStream.newLineAtOffset(0, -20);
            
            contentStream.showText("ID Colaborador:" + colaborador.getId_colab());
            contentStream.newLineAtOffset(0, -20);
            
            for (Dependente dep : dependentes) {
                contentStream.showText("ID Dependente:" + dep.getId_dep());
                contentStream.newLineAtOffset(0, -20);
                contentStream.showText("Nome Dependente: " + dep.getNomeDep());
                contentStream.newLineAtOffset(0, -20);
                contentStream.showText("CPF Dependente: " + dep.getCpfDep());
                contentStream.newLineAtOffset(0, -20);
                contentStream.showText("Data de Nascimento: R$ " + dep.getDataNasc());
                contentStream.newLineAtOffset(0, -20);
            }
            
            
            // Dados do Colaborador
            contentStream.showText("Nome Colaborador: " + colaborador.getNome());
            contentStream.newLineAtOffset(0, -20);
            contentStream.showText("CPF Colaborador: " + colaborador.getCpf());
            contentStream.newLineAtOffset(0, -20);
            contentStream.showText("Salário Líquido: R$ " + colaborador.getSalLiquido());
            contentStream.newLineAtOffset(0, -20);
            
            //Dados do Dependente
            
            
            // Vencimentos
            contentStream.showText("Horas Extras: " + colaborador.getHoraExtraQtd() + " - Valor: R$ " + colaborador.getHoraExtraValor());
            contentStream.newLineAtOffset(0, -20);
            contentStream.showText("Horas Extras (Feriado): " + colaborador.getHoraExtraFdQtd() + " - Valor: R$ " + colaborador.getHoraExtraFdValor());
            contentStream.newLineAtOffset(0, -20);
            contentStream.showText("Salário Família: R$ " + colaborador.getSalFamiiaValor());
            contentStream.newLineAtOffset(0, -20);
            contentStream.showText("Vencimentos Totais: R$ " + colaborador.getVencTotal());
            contentStream.newLineAtOffset(0, -20);
            
            // Descontos
            contentStream.showText("FGTS: R$ " + colaborador.getFgtsValor());
            contentStream.newLineAtOffset(0, -20);
            contentStream.showText("INSS: R$ " + colaborador.getInssValor());
            contentStream.newLineAtOffset(0, -20);
            contentStream.showText("Vale Transporte: R$ " + colaborador.getVtValor());
            contentStream.newLineAtOffset(0, -20);
            contentStream.showText("IRRF: R$ " + colaborador.getIrrfValor());
            contentStream.newLineAtOffset(0, -20);
            contentStream.showText("Faltas: " + colaborador.getFaltasQtd() + " - Valor: R$ " + colaborador.getFaltasValor());
            contentStream.newLineAtOffset(0, -20);
            contentStream.showText("Descontos Totais: R$ " + colaborador.getDescTotal());
            
            contentStream.endText();
        }
        
        // Salvar o documento PDF
        document.save("src/relatorios/folha_pagamento" + Constantes.ID_COLAB + "_pdf");
        System.out.println("PDF gerado com sucesso!");

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
}
