public class LoanCalculator {
    private  int loanSum, period, prc;
    // конструкторы
    public LoanCalculator() {
    }

    public LoanCalculator(int loanSum, int period, int prc) {
        this.loanSum = loanSum;
        this.period = period;
        this.prc = prc;
    }
    // геттеры-сеттеры
    public int getLoanSum() {
        return loanSum;
    }

    public void setLoanSum(int loanSum) {
        this.loanSum = loanSum;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getPrc() {
        return prc;
    }

    public void setPrc(int prc) {
        this.prc = prc;
    }
    // расчет суммы ежемесячного платежа
    public float getMonthPaySum(int loanSum, int period, int prc) {
        float result = 0.00F;
        return result;
    }
    // расчет суммы ежемесячного платежа
    public float getMonthPaySum() {
        return getMonthPaySum(this.loanSum, this.period, this.prc);
    }
    // Рассчет общей суммы к возврату в банк
    public float getFullLoanSum(int loanSum, int period, int prc) {
        return getMonthPaySum(loanSum, period, prc) * period;
    }
    // Рассчет общей суммы к возврату в банк
    public float getFullLoanSum() {
        return getFullLoanSum(this.loanSum, this.period, this.prc);
    }
    // Рассчет переплаты за весь период
    public float getOverpaymentSum(int loanSum, int period, int prc) {
        return 0.00F;
    }
    // Рассчет переплаты за весь период
    public float getOverpaymentSum() {
        return getOverpaymentSum(this.loanSum, this.period, this.prc);
    }
}
