public class SpaceRocketLauncher {
    private int bigRocketCount;
    private int smallRocketCount;

    public void launchBigRocket(){
        if (bigRocketCount > 0){
            bigRocketCount = bigRocketCount - 1;
            System.out.println("Launch big rocket");
        }
    }
    public void launchSmallRocket(){
        if (smallRocketCount > 0){
            smallRocketCount = smallRocketCount - 1;
            System.out.println("Launch small rocket");
        }
    }
    public int getTotalPower(){
        int bigRocketTotalPower = bigRocketCount * 100;
        int smallRocketTotalPower = smallRocketCount * 50;
        return bigRocketTotalPower + smallRocketTotalPower;
    }
    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if (bigRocketCount < 0 || bigRocketCount > 100) {
            return;
        }else {
            this.bigRocketCount = bigRocketCount;
        }
    }

    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount) {
        if (smallRocketCount < 0 || smallRocketCount > 100) {
            return;
        }else {
            this.smallRocketCount = smallRocketCount;
        }
    }

    public static void main(String[] args) {
        SpaceRocketLauncher launcher = new SpaceRocketLauncher();
        launcher.setBigRocketCount(5);
        launcher.setSmallRocketCount(10);

        System.out.println("Power is " + launcher.getTotalPower());

        launcher.launchBigRocket();
        System.out.println("Big rocket count is " + launcher.getBigRocketCount());

        launcher.launchSmallRocket();
        System.out.println("Small rocket count is " + launcher.getSmallRocketCount());

        System.out.println("Power is " + launcher.getTotalPower());
    }
}
