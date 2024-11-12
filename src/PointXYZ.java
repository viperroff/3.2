public class PointXYZ {
    private int x;
    private Integer y;
    private Integer z;
    private String color;
    private String timeOfAppearance;

    public PointXYZ(int x, int y){
        this(x, y, null);
    }

    public PointXYZ(int x, int y, Integer z){
        this(x, y, z, null, null);
    }

    public PointXYZ(int x, int y, Integer z, String color, String timeOfAppearence){
        this.x = x;
        this.y = y;
        this.z = z;
        this.color = color;
        this.timeOfAppearance = timeOfAppearence;
    }

    public int getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Integer getZ() {
        return z;
    }

    public String getColor() {
        return color;
    }

    public String getTimeOfAppearance() {
        return timeOfAppearance;
    }

    @Override
    public String toString() {
        StringBuilder pointStr = new StringBuilder();
        pointStr.append("Точка: {").append(x);
        if (y != null) {
            pointStr.append(", ").append(y);
        }
        if (z != null) {
            pointStr.append(", ").append(z);
        }
        pointStr.append("}");
        if (color != null) {
            pointStr.append(", Цвет: ").append(color);
        }
        if (timeOfAppearance != null) {
            pointStr.append(", Время появления: ").append(timeOfAppearance);
        }
        return pointStr.toString();
    }
}

