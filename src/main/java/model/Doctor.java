package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    private String speciality;

    public Doctor(String name, String email) {
        super(name, email);
    }

    public ArrayList<AvailableAppointment> availableAppointments = new ArrayList<AvailableAppointment>();

    public void addAvailableAppointments(Date start, String time) {
        availableAppointments.add(new AvailableAppointment(start, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nspeciality='" + speciality + '\'' +
                "\navailableAppointments=" + availableAppointments.toString() +
                '}';
    }

    public static class AvailableAppointment {
        private int ID;
        private Date date;
        private String Tiem;

        public AvailableAppointment(Date date, String Tiem) {
            this.date = date;
            this.Tiem = Tiem;

        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTiem() {
            return Tiem;
        }

        public void setTiem(String tiem) {
            Tiem = tiem;
        }

        @Override
        public String toString() {
            return "\navailableAppointments" + "date=" + date + ", Tiem=" + Tiem + "]";
        }
    }
}