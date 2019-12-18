package thread;

public class ImmutableRGB {
    private final int red;
    private final int green;
    private final int blue;

    public ImmutableRGB(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public static void main(String[] args) {

        new Thread(() -> {
            ImmutableRGB color = ColorFactory.getImmutableRGB(10, 9, 7);
            System.out.println(color.toString());
        }).start();

        new Thread(() -> {
            ImmutableRGB color = ColorFactory.getImmutableRGB(10, 19, 17);
            System.out.println(color.toString());
        }).start();
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    @Override
    public String toString() {
        return "ImmutableRGB{" +
                "red='" + red + '\'' +
                ", green='" + green + '\'' +
                ", blue='" + blue + '\'' +
                '}';
    }
}

class ColorFactory {
    public static ImmutableRGB getImmutableRGB(int r, int g, int b) {
        return new ImmutableRGB(r, g, b);
    }
}