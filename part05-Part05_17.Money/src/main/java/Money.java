
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int eurosNew = this.euros + addition.euros;
        int centsNew = this.cents + addition.cents;
        if (centsNew > 99) {
            eurosNew = eurosNew + centsNew / 100;
            centsNew = centsNew % 100;
        }
        Money newMoney = new Money (eurosNew, centsNew);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        int moneyNew = (this.euros * 100 + this.cents) - (compared.euros * 100 + compared.cents);
        if (moneyNew < 0) {
            return true;
        } 
        return false;
    }

    public Money minus(Money decreaser) {
        int eurosNew = 0;
        int centsNew = 0;
        boolean insufficient = this.lessThan(decreaser);
        if (insufficient) {
            eurosNew = 0;
            centsNew = 0;
        } else {
            int moneyNew = (this.euros * 100 + this.cents) - (decreaser.euros * 100 + decreaser.cents);
            centsNew = moneyNew % 100;
            eurosNew = moneyNew / 100;
        }
        Money newMoney = new Money (eurosNew, centsNew);
        return newMoney;
        }
       
    }


