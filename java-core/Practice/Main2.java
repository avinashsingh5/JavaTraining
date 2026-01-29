//Practice question DNA worldwide
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

class ForensicReport{
    private Map<String,Date> reportMap = new HashMap<>();

    public void addReportDetails(String reportingOfficerName,Date reportFiledDate){
        reportMap.put(reportingOfficerName,reportFiledDate);
    }

    public ArrayList<String> getOfficersWhoFiledReportsOnDate(Date reportFiledDate){
        ArrayList<String> ans = new ArrayList<>();
        for(Map.Entry<String,Date> entry: reportMap.entrySet() ){
            if(entry.getValue().equals(reportFiledDate)) ans.add(entry.getKey());
        }
        return ans;
    }
}

class Main2{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        ForensicReport f = new ForensicReport();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Enter the number of reports to be added ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the forensic Reports (Reporting Officer: Reported file date)");
        for(int i=0;i<n;i++){
            String input = sc.nextLine();
            String[] parts = input.split(":");
            String name = parts[0];
            Date date = sdf.parse(parts[1]);
            f.addReportDetails(name,date);
        }
        System.out.println("Enter the filed date to find reporting officer");
        String input = sc.nextLine();
        Date date = sdf.parse(input);
        System.out.println("Report filed on "+input+" are by");
        ArrayList<String> OfficersList = f.getOfficersWhoFiledReportsOnDate(date);
        for(int i=0;i<OfficersList.size();i++){
            System.out.println(OfficersList.get(i));
        }
    }
}