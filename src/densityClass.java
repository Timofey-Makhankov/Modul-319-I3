/**
 * This class includes methods to calculate density from
 * 
 * @author Timofey Makhankov
 */
public class densityClass {
    /**
     * @Param mass and volume is given in
     * @return the calculated density from mass and volume
     * @since 1.0
     */
    public static float toDensity(int mass, int volume) {
        return mass / volume;
    }

    /**
     * @Param density and volume is given in
     * @return the calculated density from density and volume
     * @since 1.0
     */
    public static float toMass(int density, int volume) {
        return volume * density;
    }

    /**
     * @Param density and mass is given in
     * @return the calculated density from density and mass
     * @since 1.0
     */
    public static float toVolume(int density, int mass) {
        return mass / density;
    }
}
