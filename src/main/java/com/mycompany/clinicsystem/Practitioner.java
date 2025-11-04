
package com.mycompany.clinicsystem;
import java.util.*;


public class Practitioner extends User{
    private Clinic clinic;
    public Practitioner(int ID, String name, String phone, String email, String password, Clinic clinic) {
        super(ID, name, phone, email, password);
        this.clinic = clinic;
    }
    public List<Appointment> getAppointments() {
        return clinic != null ? clinic.getAppointments() : null;
    }

    public List<Rating> getRatings() {
        return clinic != null ? clinic.getRatings() : null;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public void updateClinicInfo() {
        if (clinic != null) {
            clinic.updateSchedule();
        }
    }
}
    
}