package nl.tweeenveertig.openstack.headers.range;

/**
 * Take the object starting at 'startPos' and ending at 'endPos'
 */
public class MidPartRange extends AbstractRange {

    public MidPartRange(int startPos, int endPos) {
        super(startPos, endPos);
    }

    @Override
    public int getFrom(int byteArrayLength) {
        return offset;
    }

    @Override
    public int getTo(int byteArrayLength) {
        return length;
    }
}
