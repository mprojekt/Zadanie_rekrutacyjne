package zadanie.rekrutacyjne;


public final class Money {
    
    private int gr;

    public Money() {
        gr = 0;
    }

    public Money(int zlote, int grosze) {
        this();
        add(zlote, grosze);
    }

    public Money(double money) {        
        this();
        add((int)(money * 100));
    }
    
    public void add(double money){
        add((int)(money * 100));
    }
    
    public void add(int zlote, int grosze){
        int tmp;
        if((zlote < 0) && (grosze > 0)){
            tmp = zlote * 100 - grosze;
        } else if((zlote > 0) && (grosze < 0)){
            tmp = zlote * -100 + grosze;
        } else
            tmp = zlote * 100 + grosze;
        
        add(tmp);
    }
    
    public void sub(double money){
        add(-(int)(money * 100));
    }
    
    public void sub(int zlote, int grosze){
        int tmp;
        if((zlote < 0) && (grosze > 0)){
            tmp = zlote * 100 - grosze;
        } else if((zlote > 0) && (grosze < 0)){
            tmp = zlote * -100 + grosze;
        } else
            tmp = zlote * 100 + grosze;
        
        add(-tmp);
    }

    public int getZlote() {
        return (int) gr / 100;
    }

    public void setZlote(int zlote) {
        gr = zlote * 100;
    }

    public int getGrosze() {
        return gr % 100;
    }

    public void setGrosze(int grosze) {
        gr = grosze;
    }

    @Override
    public String toString() {
        int tmp = ((getGrosze() < 0)? -getGrosze() : getGrosze());
        return getZlote() + "," + ((tmp < 10) ? "0" : "") + tmp;
    }
    
    private void add(int number){
        gr += number;
    }
    
}
