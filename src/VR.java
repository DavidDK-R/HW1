package HW1;
import java.lang.*;

public class VR
{
        private int size;
        private String manufacturer;

        public VR (int size, String manufacturer) {
            this.size = size;
            this.manufacturer = manufacturer;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

    @Override
    public String toString() {
        return "VR{" +
                "size=" + size +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
