package fabricacafe2;

public abstract class MaquinaDeBebidas {

    public abstract Bebida entregaBebiba();
    
     public String exibeMensagem() {
                   return "Bem-vindo à máquina de bebidas";
         }
     
     public enum TipoDoCafe {CURTO, PINGADO, EXPRESSO};

    public Bebida entregaBebiba(TipoDoCafe tipoDoCafe) {
    Bebida cafe = null;

    switch (tipoDoCafe) {
    case EXPRESSO: cafe = new CafeExpresso();
    case CURTO: cafe = new CafeCurto();
    case PINGADO: cafe = new CafePingado();
    }

    return cafe;
}
    
     
}
