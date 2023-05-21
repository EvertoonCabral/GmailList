package com.everton.gmaillist.model;

import java.util.Arrays;
import java.util.List;

public class Emails  {

    public static List<Email> fakeList(){
        return Arrays.asList(

            Email.EmailBuilder.builder()
                    .setUser("Facebook")
                    .setSubject("Veja nossas três principais dicas para proteger sua conta")
                    .setDate("5 jun")
                    .build(),
                Email.EmailBuilder.builder()
                        .setUser("Twitter")
                        .setSubject("João XD curtiu sua publicação")
                        .setPreview("Joãozinho curtiu seu post sobre Desenvolvimento de aplicações mobile")
                        .setDate("30 mai")
                        .build(),
                Email.EmailBuilder.builder()
                        .setUser("LinkedIn")
                        .setSubject("Você tem novas conexões em potencial")
                        .setPreview("Confira as pessoas que se conectaram recentemente ao seu perfil")
                        .setDate("12 jun")
                        .setUnread(true)
                        .setStared(false)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Google Drive")
                        .setSubject("Compartilhamento de arquivo concluído")
                        .setPreview("Seu arquivo 'Relatório de Vendas' foi compartilhado com sucesso")
                        .setDate("8 jun")
                        .setUnread(false)
                        .setStared(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Amazon")
                        .setSubject("Confirmação de compra")
                        .setPreview("Seu pedido foi processado e está a caminho")
                        .setDate("10 jun")
                        .setUnread(true)
                        .setStared(false)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Netflix")
                        .setSubject("Novos lançamentos disponíveis")
                        .setDate("6 jun")
                        .setUnread(false)
                        .setStared(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Apple")
                        .setSubject("Atualização de software disponível")
                        .setPreview("Uma nova versão do iOS está pronta para ser instalada")
                        .setDate("7 jun")
                        .setUnread(true)
                        .setStared(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Instagram")
                        .setSubject("Você foi mencionado em uma história")
                        .setPreview("Confira a história em que você foi marcado")
                        .setDate("9 jun")
                        .setUnread(false)
                        .setStared(false)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("WhatsApp")
                        .setSubject("Nova mensagem recebida")
                        .setPreview("Você tem uma nova mensagem de Maria")
                        .setDate("11 jun")
                        .setUnread(true)
                        .setStared(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("YouTube")
                        .setSubject("Novo vídeo recomendado para você")
                        .setPreview("Confira o vídeo 'As melhores dicas de viagem'")
                        .setDate("13 jun")
                        .setUnread(false)
                        .setStared(false)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Dropbox")
                        .setSubject("Compartilhamento de pasta aceito")
                        .setPreview("Seu convite para colaborar foi aceito por Ana")
                        .setDate("14 jun")
                        .setUnread(true)
                        .setStared(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Microsoft Teams")
                        .setSubject("Nova reunião agendada")
                        .setPreview("Você tem uma reunião marcada para amanhã às 14h")
                        .setDate("15 jun")
                        .setUnread(false)
                        .setStared(false)
                        .build()
        );
    }

}
