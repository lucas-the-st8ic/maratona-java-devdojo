package academy.devdojo.maratonajava.javacore.Kenumeracoes.dominio;

public enum TipoPagamento {
        DEBITO("Débito") {
            @Override
            public double CalcularDesconto(double valor) {
                return valor * 0.1;
            }
        },
        CREDITO("Crédito") {
            @Override
            public double CalcularDesconto(double valor) {
                return valor * 0.05;
            }
        };

        private String tipoPagamento;

        public abstract double CalcularDesconto(double valor);
        TipoPagamento(String tipoPagamento) {
            this.tipoPagamento = tipoPagamento;
        }

        public String getTipoPagamento() {
            return tipoPagamento;
        }

}