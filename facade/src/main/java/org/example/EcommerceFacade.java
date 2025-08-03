package org.example;

import com.sun.nio.sctp.Notification;

public class EcommerceFacade {
    private Estoque estoque;
    private Pagamento pagamento;
    private Notificacao notificacao;
    private  Envio envio;

    public EcommerceFacade() {

    }

    public EcommerceFacade(Estoque estoque, Pagamento pagamento, Notificacao notificacao, Envio envio) {
        this.estoque = estoque;
        this.pagamento = pagamento;
        this.notificacao = notificacao;
        this.envio = envio;
    }

    public void processarPedido(String produtoId, String usuarioId){
        try {
            if (estoque.checarEstoque(produtoId) && pagamento.processarPagamento(usuarioId)) {
                envio.enviarPedido(produtoId, usuarioId);
            }
        } catch (Exception e){
            e.printStackTrace();
            e.getMessage();
            System.out.println("não há pedido informado!");
        }
    }
}
