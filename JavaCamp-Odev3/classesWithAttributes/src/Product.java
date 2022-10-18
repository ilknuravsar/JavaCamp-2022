public class Product {
    private int _id;
    private String _name;
    private String _desc;
    private double _price;
    private int _stockAmount;
    private String _renk;
    private String _kod;

    public Product() {
        System.out.println("cons basladı");
    }
    public Product(int _id,String _name, String _desc,double _price, int _stockAmount, String _renk, String _kod) {
        System.out.println("parametreli const basladı");
    this._id = _id;
    this._name = _name;
    this._desc =_desc;
    this._renk =_renk;
    this._kod =_kod;
    this._stockAmount = _stockAmount;


    }


    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_desc() {
        return _desc;
    }

    public void set_desc(String _desc) {
        this._desc = _desc;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }

    public String get_renk() {
        return _renk;
    }

    public void set_renk(String _renk) {
        this._renk = _renk;
    }

    public String get_kod() {
        return _kod;
    }

    public void set_kod(String _kod) {
        this._kod = _kod;
    }
}
