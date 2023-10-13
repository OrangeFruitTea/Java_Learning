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
        this._netWeight = netWeight;
        this._sizeLength = sizeLength;
        this._sizeWidth = sizeLength;
        this._sizeHeight = sizeHeight;
        this._maxLoadWeight = maxLoadWeight;
        this._maxLoadVolume = maxLoadVolume;
    }

    public int get_truckId() {
        return _truckId;
    }
    public StorageTypes get_storageType() {
        return _storageType;
    }
    public char[] get_usingRange() {
        return _usingRange;
    }
    public double get_netWeight() {
        return _netWeight;
    }
    public double get_sizeLength() {
        return _sizeLength;
    }
    public double get_sizeWidth() {
        return _sizeWidth;
    }
    public double get_sizeHeight() {
        return _sizeHeight;
    }
    public double get_maxLoadVolume() {
        return _maxLoadVolume;
    }
    public double get_maxLoadWeight() {
        return _maxLoadWeight;
    }
    public void set_truckId(int truckId) {
        this._truckId = truckId;
    }
    public void set_storageType(StorageTypes storageType) {
        this._storageType = storageType;
    }

    public void set_usingRange(char[] _usingRange) {
        this._usingRange = _usingRange;
    }
    public void set_netWeight(double _netWeight) {
        this._netWeight = _netWeight;
    }

    public void set_maxLoadVolume(double _maxLoadVolume) {
        this._maxLoadVolume = _maxLoadVolume;
    }

    public void set_maxLoadWeight(double _maxLoadWeight) {
        this._maxLoadWeight = _maxLoadWeight;
    }

    public void set_sizeHeight(double _sizeHeight) {
        this._sizeHeight = _sizeHeight;
    }

    public void set_sizeLength(double _sizeLength) {
        this._sizeLength = _sizeLength;
    }

    public void set_sizeWidth(double _sizeWidth) {
        this._sizeWidth = _sizeWidth;
    }


}
