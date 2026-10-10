class PlacementRecord {
    String studentName, company;
    double packageLpa;

    PlacementRecord(String name, String company, double lpa) {
        studentName = name;
        this.company = company;
        packageLpa = lpa;
    }

    void printRecord() {
        System.out.println(studentName + " -> " + company
                + " @ " + packageLpa + " LPA");
    }

    public static void main(String[] args) {
        PlacementRecord[] p = {
            new PlacementRecord("Ravi", "TCS", 4.5),
            new PlacementRecord("Anitha", "Zoho", 6.2),
            new PlacementRecord("Karthik", "Infosys", 4.0)
        };

        for (PlacementRecord r : p)
            r.printRecord();
    }
}
