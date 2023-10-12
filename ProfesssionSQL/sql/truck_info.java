package sql;

import com.sun.org.apache.xpath.internal.objects.XString;

public class truck_info {
    private int _truckId;
    private StorageTypes _storageType;

    private char[] _usingRange;
    private double _netWeight;
    private double _sizeLength;
    private double _sizeWidth;
    private double _sizeHeight;
    private double _maxLoadWeight;
    private double _maxLoadVolume;

    public truck_info() {

    }

    public truck_info(int truckId, StorageTypes storageType, char[] usingRange, double netWeight, double sizeLength, double sizeWidth, double sizeHeight, double maxLoadWeight, double maxLoadVolume) {
        this._truckId = truckId;
        this._storageType = storageType;
        this._usingRange = usingRange;
        this._sizeLength = sizeLength;
        this._sizeWidth = sizeLength;
        this._sizeHeight = sizeHeight;
        this._maxLoadWeight = maxLoadWeight;
        this._maxLoadVolume = maxLoadVolume;
    }

    public int get_truckId() {
        return _truckId;
    }

}
