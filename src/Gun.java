class Gun extends Weapon {
    private int ammo = super.ammo();
    private int returnedAmmo = 0;
    final int maxAmmo;

    public Gun(int ammo){
        this(ammo, ammo);
    }

    public Gun(int ammo, int maxAmmo){
        super(ammo);
        this.maxAmmo = maxAmmo;
    }

    public void shoot() {
        if (ammo > 0) {
            ammo--;
            System.out.println("Бах!");
        } else {
            System.out.println("Клац!");
        }
    }


    public String getMaxAmmo(){
        return "Максимальное количество патронов: " + this.maxAmmo;
    }

    public String getCharge(){
        String result = this.ammo == 0 ? "пистолет разряжен" : "пистолет заряжен";
        return result;
    }

    public String recharge(int ammo){
        String result;
        if(ammo < 0) throw new IllegalArgumentException("Количество патронов не может быть отрицательным");
        if(ammo > this.maxAmmo){
            this.ammo = this.maxAmmo;
            this.returnedAmmo = ammo - this.maxAmmo;
            result = "Пистолет перезаряжен на " + this.ammo + " патронов, возвращено: " + (ammo - this.maxAmmo);
        }else {
            this.ammo = ammo;
            result = "Пистолет перезаряжен на" + this.ammo + "патронов";
        }
        return result;
    }

    public String discharge(){
        this.returnedAmmo = this.ammo;
        this.ammo = 0;
        return "Пистолет был разряжен, было возвращено " + this.returnedAmmo + " патронов";
    }

}