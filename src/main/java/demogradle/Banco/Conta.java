public class Conta{
 
    private int codigo;
    private double saldo;
    private double limite;
    
    
    public Conta(){
    }
    
    public Conta(int codigo, double limite){
      this.codigo = codigo;
    }
    
    public int getCodigo(){
    return codigo;
    }
    
    public double getSaldo(){
      return saldo;
    }
    
    public void setCodigo ( int codigo){
      if (codigo > 0)
      this.codigo = codigo;
       else
            throw new IllegalArgumentException ("Erro: número menor ou igual a 0");
    }
    
    public double getLimite(){
      return limite;
    }
    
    public void setLimite ( double limite){
      if (limite> 0)
      this.limite = limite;
       else
            throw new IllegalArgumentException ("Erro: número menor ou igual a 0");
    }
    
    
     public boolean depositar (double valor){
       if (valor > 0){
         saldo = saldo + valor;
         return true;
       }
       return false;
     }
    
     public boolean sacar (double valor){
       if (saldo >= valor && valor > 0){
         saldo = saldo - valor;
         return true;
       }
       return false;
     }
    
     public boolean transferir(Conta conta, double valor) { 
            if (valor <= saldo + limite) {
                saldo = saldo - valor;
                conta.saldo = conta.saldo + valor;
                return true;
            }
            return false;
        }
    }