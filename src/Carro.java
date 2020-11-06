public class Carro
{
    private String cor;
    private String marca;
    private float motor;
    private boolean ligado;

    public Carro(String cor, String marca, float motor)
    {
        this.cor = cor;
        this.marca = marca;
        this.motor = motor;
        this.ligado = false;
    }

    public void ligar()
    {
       acelerar();
    }
    
    public void desligar()
    {
        if(this.ligado == false)
        {
            System.out.println("Desligado");
        }
    }

    private void acelerar()
    {
        if(this.ligado == true)
        {
            System.out.println("Acelerando");
        }
        else
        {
            System.out.println("Parado");
        }
    }

    public void status()
    {
        System.out.println("...............");
        System.out.println("Carro");
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Motor: " + this.motor);
        System.out.println("Ligado: " + this.ligado);
    }

    public void setCor(String cor)
    {
        this.cor = cor;
    }

    public String getCor()
    {
        return this.cor;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getMarca()
    {
        return this.marca;
    }

    public void setMotor(float motor)
    {
        this.motor = motor;
    }

    public float getMotor()
    {
        return this.motor;
    }

}