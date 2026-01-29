
@FunctionalInterface
interface LoanApprovalRule{
    boolean approve(LoanApplication app);
}

class LoanApplication{
    double income;
    int creditScore;
    double amountRequested;

    LoanApplication(double income, int creditScore, double amountRequested){
        this.income = income;
        this.creditScore = creditScore;
        this.amountRequested = amountRequested;
    }
}
public class LoanApproval{
    public static void main(String[] args){
        LoanApprovalRule creditScoreRule = (l) -> {
            if(l.creditScore>=700) return true;
            return false;
        };
        LoanApprovalRule incomeRule = (l) ->{
            if(l.income>=50000) return true;
            return false;
        };
        LoanApprovalRule safeBorrowingRule = (l) ->{
            if(l.amountRequested<= l.income*0.30) return true;
            return false;
        };
        LoanApplication l1 = new LoanApplication(60000,720,36000);
        System.out.println("Credit Score Rule: "+(creditScoreRule.approve(l1)?"Approved":"Rejected"));
        System.out.println("Income Rule: "+(incomeRule.approve(l1)?"Approved":"Rejected"));
        System.out.println("Safe Borrow Rule: "+(safeBorrowingRule.approve(l1)?"Approved":"Rejected"));
    }
}