public class NullSafety {

    public static void main(String[] args) {
        Company company = new Company();
        Integer length = 0;
        if (company != null) {
            if (company.department != null) {
                if (company.department.team != null) {
                    length = company.department.team.name.length();
                }
            }
        }
    }

    private static class Company {
        public Department department;
    }

    private class Department {
        public Team team;
    }

    private class Team {
        public String name;
    }
}


