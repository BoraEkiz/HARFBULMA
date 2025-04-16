package enums;

enum Day{
        SUNDAY("9:00 - 17:00"),
        MONDAY("9:00 - 17:00"),
        TUESDAY("9:00 - 17:00"),
        WEDNESDAY("9:00 - 17:00"),
        THURSDAY("9:00 - 17:00"),
        FRIDAY("9:00 - 17:00"),
        SATURDAY("9:00 - 17:00");


        private final String workHours;

    Day(String workHours) {
        this.workHours = workHours;
    }

    public String getWorkHours() {
        return workHours;
    }
}


