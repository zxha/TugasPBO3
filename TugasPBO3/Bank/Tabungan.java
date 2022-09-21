package Bank;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo(int saldo) {
        return saldo;
    }

    public void simpanUang(int jumlah) {
        
    }
    
    public boolean ambilUang(int jumlah) {
        if ((saldo - jumlah) < 0) {
            return false;
        } else {
            saldo -= jumlah;
            return true;
        }
    }
    
    public boolean transfer(Tabungan t, int jumlah){
        if(saldo > jumlah ){
            saldo -= jumlah;
            t.saldo += jumlah;
            return true;
        }else return false;
    }
    
}
