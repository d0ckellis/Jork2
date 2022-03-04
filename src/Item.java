/**
 * An enumeration for items to be stored in the {@link Inventory#inventory} {@code HashMap}.
 * @author jaspersn
 * @author alexb
 * @version 1.1
 */
public enum Item {

    /**
     * Sword
     */
    SWORD("SWORD"),
    /**
     * Rug
     */
    RUG("RUG"),
    /**
     * Nails
     */
    NAILS("NAILS"),
    /**
     * Potion
     */
    POTION("POTION"),
    /**
     * Key
     */
    KEY("KEY"),
    /**
     * Parchment
     */
    PARCHMENT("PARCHMENT"),
    /**
     * Cloak
     */
    CLOAK("CLOAK"),
    /**
     * Marker
     */
    MARKER("MARKER"),
    /**
     * Necklace
     */
    NECKLACE("NECKLACE");





    /**
     * The {@code String} corresponding to a particular value of the enumeration.
     */
    private final String key;

    /**
     * Constructs a new {@link Item} with the specified {@code String}.
     * @param key The {@code String}.
     */
    Item(final String key) {
        this.key = key;
    }

    /**
     * Returns the {@code String} corresponding to a particular value of the enumeration.
     * @return the {@code String} corresponding to a particular value of the enumeration.
     */
    public String getKey() {
        return key;
    }
}
