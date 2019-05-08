package fabricacafe2;

public class MaquinaDeCafe extends MaquinaDeBebidas{

    @Override
    public Bebida entregaBebiba() {
       return new Cafe();
    }
    
}
