package com.curso.fjoo.enums;

public enum OperacaoAritmetica {

    ADICAO {
        @Override
        public int operacao(int x, int y) {
            return x + y;
        }
    },
    SUBTRACAO {
        @Override
        public int operacao(int x, int y) {
            return x - y;
        }
    },

    MULTIPLICACAO{
        @Override
        public int operacao(int x, int y) {
            return x * y;
        }
    },
    DIVISAO{
        @Override
        public int operacao(int x, int y) {
            return x / y;
        }
    };


    public abstract int operacao(int x, int y);


}
