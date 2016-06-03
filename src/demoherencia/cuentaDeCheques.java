package demoherencia;

public class cuentaDeCheques extends cuentaBancaria {
    private int chequesEmitidos;
    private int chequesRebotados;
    
    public cuentaDeCheques (int numeroDeCuenta, String cliente) {
        super(numeroDeCuenta, cliente);
        super.depositar(2000.0);
        chequesEmitidos = 0;
        chequesRebotados = 0;
    }
    public boolean Retirar(double cantidad) {
        boolean seEfectuoRetiro = super.retirar(cantidad);
        if (seEfectuoRetiro == true) {
            chequesEmitidos = chequesEmitidos + 1;
        }
        else {
            chequesRebotados ++;
        }
        return seEfectuoRetiro;
    }
    public double calcularInteresPorChequesEmitidos() {
        double comision = (chequesEmitidos - 5.0) * 5.0;
        return comision;
    }    
    public double calcularComisionPorChequesRebotados() {
        return chequesRebotados * 100.0;
    }
}
