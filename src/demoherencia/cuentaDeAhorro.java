package demoherencia;

public class cuentaDeAhorro extends cuentaBancaria {
    private double tasaDeInteres;
    private double comisionPorSaldo;
    
    public cuentaDeAhorro (int numeroDeCuenta, String cliente) {
        super(numeroDeCuenta, cliente);
        this.tasaDeInteres = 0.25;
        this.comisionPorSaldo = 50.0;
    }
    public boolean seRealizoDeposito (double cantidad) {
    boolean siDepositar = false;
        if (cantidad < super.getSaldo()) {
            siDepositar = true;
        }
        return siDepositar;
    }
    public double getSaldo() {
        return super.getSaldo();
    }
    public boolean seRealizoRetiro(double cantidad) {
        boolean siRetirar = false;
        if (cantidad < super.getSaldo()) {
            siRetirar = true;
        }
        return siRetirar;
    }
    public double comisionPorSaldo() {
        double comisionPorSaldo = 0;
        if (super.getSaldo() < 1000.0) {
            comisionPorSaldo = 50;
        }
        else {
            comisionPorSaldo = 0.0;
        }
        return comisionPorSaldo;
    }
    public double tasaDeInteres() {
        double interes = 0;
        interes = (super.getSaldo() * this.tasaDeInteres) / 100.0;
        return interes;
    }
}
