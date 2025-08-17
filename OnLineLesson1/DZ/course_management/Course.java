public class Course {
    private final String courseName;
    private final String courseTeacher;
    private final int numberOfStudents;
    private final int courseDuration;
    private final boolean isActive;
    private final boolean isAdvanced;

    private Course(Builder builder){
        this.courseName = builder.cName;
        this.courseTeacher = builder.cTeacher;
        this.numberOfStudents = builder.cNumStudents;
        this.courseDuration = builder.cDur;
        this.isActive = builder.cActive;
        this.isAdvanced = builder.cAdvanced;
    }

     
    public String getCourseName() {
        return courseName;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isAdvanced() {
        return isAdvanced;
    }

    public Builder toBuilder() {
        return new Builder()
        .cName(this.courseName)
        .cTeacher(this.courseTeacher)
        .cNumStudents(this.numberOfStudents)
        .cDur(this.courseDuration)
        .cActive(this.isActive)
        .cAdvanced(this.isAdvanced);
    }

    public static class Builder{
        private String cName;
        private String cTeacher;
        private int cNumStudents;
        private int cDur;
        private boolean cActive;
        private boolean cAdvanced;

        public Builder cName(String cName){
            this.cName = cName;
            return this;
        }

        public Builder cTeacher(String cTeacher){
            this.cTeacher = cTeacher;
            return this;
        }
        
        public Builder cNumStudents(int cNumStudents){
            this.cNumStudents = cNumStudents;
            return this;
        }

        public Builder cDur(int cDur){
            this.cDur = cDur;
            return this;
        }

        public Builder cActive(boolean cActive){
            this.cActive = cActive;
            return this;
        }

        public Builder cAdvanced(boolean cAdvanced){
            this.cAdvanced = cAdvanced;
            return this;
        }

        public Course build() {
            validate();
            return new Course(this);
        }

        private void validate(){
            if (cName == null || cName.isEmpty()) {
                throw new IllegalArgumentException("Название курса не задано");
            }
            if (cTeacher == null || cTeacher.isEmpty()) {
                throw new IllegalArgumentException("На курс не назначен преподаватель");
            }
            if (cNumStudents < 5) {
                throw new IllegalArgumentException("Нет или мало студентов на курс");
            }
            if (cDur == 0 || cDur < 1) {
                throw new IllegalArgumentException("Ошибка длительности курса или мало дней");
            }

        }

        
    }

    public String toString() {
        return "Курс { название='" + courseName + "', Преподаватель =" + courseTeacher +
                ", число студентов='" + numberOfStudents + "', длительность, дн.='" + courseDuration + "', читается = '" + isActive + "', продвинутый= '" + isAdvanced + "'}";
            }

}


