package com.example.asus.food;

/**
 * Created by Asus on 12/10/2017.
 */

public class food {
    public CharSequence getJudulResep() {
        CharSequence judulfood;
        return judulfood;
    }

    public boolean getStepResep() {
        boolean stepfood;
        return stepfood;
    }

    public class Resep {
        private String judulResep;
        private String penjelasanResep;
        private String bahanResep;
        private String stepResep;
        private int gambarResep;

        public Resep(int gambarResep, String judulResep, String penjelasanResep, String bahanResep, String stepResep){
            this.gambarResep = gambarResep;
            this.judulResep = judulResep;
            this.penjelasanResep = penjelasanResep;
            this.bahanResep = bahanResep;
            this.stepResep = stepResep;
        }

        public String getJudulResep(){
            return judulResep;
        }

        public String getPenjelasanResep(){
            return penjelasanResep;
        }

        public int getGambarResep(){
            return gambarResep;
        }

        public String getBahanResep() {
            return bahanResep;
        }

        public String getStepResep() {
            return stepResep;
        }
    }



}
