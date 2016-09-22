package apporio.com.ziffiapp.Api_Manage;

import java.util.List;

/**
 * Created by apporio3 on 9/16/2016.
 */
public class ProductList_settergetter {


    /**
     * result : 1
     * data : [{"product_id":"51","model":"123","sku":"","upc":"","ean":"","jan":"","isbn":"","mpn":"","location":"","quantity":"1","stock_status_id":"6","image":"","manufacturer_id":"0","shipping":"1","price":"0.0000","points":"0","tax_class_id":"0","date_available":"2016-07-30","weight":"0.00000000","weight_class_id":"1","length":"0.00000000","width":"0.00000000","height":"0.00000000","length_class_id":"1","subtract":"1","minimum":"1","sort_order":"1","status":"1","viewed":"0","date_added":"2016-07-30 11:15:55","date_modified":"0000-00-00 00:00:00","name":"","description":"","category_id":"","category_name":"","filter_id":"","filter_name":"","manufacturer_name":"","special":[],"attributes":[],"discounts":[{"product_discount_id":"448","product_id":"51","customer_group_id":"1","quantity":"2","priority":"1","price":"0.0000","date_start":"0000-00-00","date_end":"0000-00-00"}],"category_ids":[],"filter_ids":[]},{"product_id":"129","model":"123","sku":"","upc":"","ean":"","jan":"","isbn":"","mpn":"","location":"","quantity":"1","stock_status_id":"6","image":"","manufacturer_id":"0","shipping":"1","price":"2300.0000","points":"0","tax_class_id":"0","date_available":"2016-09-15","weight":"0.00000000","weight_class_id":"1","length":"0.00000000","width":"0.00000000","height":"0.00000000","length_class_id":"1","subtract":"1","minimum":"1","sort_order":"1","status":"1","viewed":"0","date_added":"2016-09-15 14:06:22","date_modified":"2016-09-15 14:08:37","name":"Hair Ironing","description":"","category_id":"201","category_name":"Hair Straightening","filter_id":"","filter_name":"","manufacturer_name":"","special":[],"attributes":[],"discounts":[],"category_ids":[{"category_id":"201","name":"Hair Straightening","sort_order":"0"}],"filter_ids":[]},{"product_id":"130","model":"123","sku":"","upc":"","ean":"","jan":"","isbn":"","mpn":"","location":"","quantity":"1","stock_status_id":"6","image":"","manufacturer_id":"0","shipping":"1","price":"2000.0000","points":"0","tax_class_id":"0","date_available":"2016-09-15","weight":"0.00000000","weight_class_id":"1","length":"0.00000000","width":"0.00000000","height":"0.00000000","length_class_id":"1","subtract":"1","minimum":"1","sort_order":"1","status":"0","viewed":"0","date_added":"2016-09-15 14:06:47","date_modified":"0000-00-00 00:00:00","name":"Hair Rebonding","description":"","category_id":"201","category_name":"Hair Straightening","filter_id":"","filter_name":"","manufacturer_name":"","special":[],"attributes":[],"discounts":[],"category_ids":[{"category_id":"201","name":"Hair Straightening","sort_order":"0"}],"filter_ids":[]},{"product_id":"131","model":"123","sku":"","upc":"","ean":"","jan":"","isbn":"","mpn":"","location":"","quantity":"1","stock_status_id":"6","image":"","manufacturer_id":"0","shipping":"1","price":"2000.0000","points":"0","tax_class_id":"0","date_available":"2016-09-15","weight":"0.00000000","weight_class_id":"1","length":"0.00000000","width":"0.00000000","height":"0.00000000","length_class_id":"1","subtract":"1","minimum":"1","sort_order":"1","status":"0","viewed":"0","date_added":"2016-09-15 14:07:01","date_modified":"0000-00-00 00:00:00","name":"Hair Rebonding","description":"","category_id":"201","category_name":"Hair Straightening","filter_id":"","filter_name":"","manufacturer_name":"","special":[],"attributes":[],"discounts":[],"category_ids":[{"category_id":"201","name":"Hair Straightening","sort_order":"0"}],"filter_ids":[]}]
     */

    private int result;
    /**
     * product_id : 51
     * model : 123
     * sku :
     * upc :
     * ean :
     * jan :
     * isbn :
     * mpn :
     * location :
     * quantity : 1
     * stock_status_id : 6
     * image :
     * manufacturer_id : 0
     * shipping : 1
     * price : 0.0000
     * points : 0
     * tax_class_id : 0
     * date_available : 2016-07-30
     * weight : 0.00000000
     * weight_class_id : 1
     * length : 0.00000000
     * width : 0.00000000
     * height : 0.00000000
     * length_class_id : 1
     * subtract : 1
     * minimum : 1
     * sort_order : 1
     * status : 1
     * viewed : 0
     * date_added : 2016-07-30 11:15:55
     * date_modified : 0000-00-00 00:00:00
     * name :
     * description :
     * category_id :
     * category_name :
     * filter_id :
     * filter_name :
     * manufacturer_name :
     * special : []
     * attributes : []
     * discounts : [{"product_discount_id":"448","product_id":"51","customer_group_id":"1","quantity":"2","priority":"1","price":"0.0000","date_start":"0000-00-00","date_end":"0000-00-00"}]
     * category_ids : []
     * filter_ids : []
     */

    private List<DataBean> data;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String product_id;
        private String model;
        private String sku;
        private String upc;
        private String ean;
        private String jan;
        private String isbn;
        private String mpn;
        private String location;
        private String quantity;
        private String stock_status_id;
        private String image;
        private String manufacturer_id;
        private String shipping;
        private String price;
        private String points;
        private String tax_class_id;
        private String date_available;
        private String weight;
        private String weight_class_id;
        private String length;
        private String width;
        private String height;
        private String length_class_id;
        private String subtract;
        private String minimum;
        private String sort_order;
        private String status;
        private String viewed;
        private String date_added;
        private String date_modified;
        private String name;
        private String description;
        private String category_id;
        private String category_name;
        private String filter_id;
        private String filter_name;
        private String manufacturer_name;
        private List<?> special;
        private List<?> attributes;
        /**
         * product_discount_id : 448
         * product_id : 51
         * customer_group_id : 1
         * quantity : 2
         * priority : 1
         * price : 0.0000
         * date_start : 0000-00-00
         * date_end : 0000-00-00
         */

        private List<DiscountsBean> discounts;
        private List<?> category_ids;
        private List<?> filter_ids;

        public String getProduct_id() {
            return product_id;
        }

        public void setProduct_id(String product_id) {
            this.product_id = product_id;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getSku() {
            return sku;
        }

        public void setSku(String sku) {
            this.sku = sku;
        }

        public String getUpc() {
            return upc;
        }

        public void setUpc(String upc) {
            this.upc = upc;
        }

        public String getEan() {
            return ean;
        }

        public void setEan(String ean) {
            this.ean = ean;
        }

        public String getJan() {
            return jan;
        }

        public void setJan(String jan) {
            this.jan = jan;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public String getMpn() {
            return mpn;
        }

        public void setMpn(String mpn) {
            this.mpn = mpn;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public String getStock_status_id() {
            return stock_status_id;
        }

        public void setStock_status_id(String stock_status_id) {
            this.stock_status_id = stock_status_id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getManufacturer_id() {
            return manufacturer_id;
        }

        public void setManufacturer_id(String manufacturer_id) {
            this.manufacturer_id = manufacturer_id;
        }

        public String getShipping() {
            return shipping;
        }

        public void setShipping(String shipping) {
            this.shipping = shipping;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getPoints() {
            return points;
        }

        public void setPoints(String points) {
            this.points = points;
        }

        public String getTax_class_id() {
            return tax_class_id;
        }

        public void setTax_class_id(String tax_class_id) {
            this.tax_class_id = tax_class_id;
        }

        public String getDate_available() {
            return date_available;
        }

        public void setDate_available(String date_available) {
            this.date_available = date_available;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public String getWeight_class_id() {
            return weight_class_id;
        }

        public void setWeight_class_id(String weight_class_id) {
            this.weight_class_id = weight_class_id;
        }

        public String getLength() {
            return length;
        }

        public void setLength(String length) {
            this.length = length;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getLength_class_id() {
            return length_class_id;
        }

        public void setLength_class_id(String length_class_id) {
            this.length_class_id = length_class_id;
        }

        public String getSubtract() {
            return subtract;
        }

        public void setSubtract(String subtract) {
            this.subtract = subtract;
        }

        public String getMinimum() {
            return minimum;
        }

        public void setMinimum(String minimum) {
            this.minimum = minimum;
        }

        public String getSort_order() {
            return sort_order;
        }

        public void setSort_order(String sort_order) {
            this.sort_order = sort_order;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getViewed() {
            return viewed;
        }

        public void setViewed(String viewed) {
            this.viewed = viewed;
        }

        public String getDate_added() {
            return date_added;
        }

        public void setDate_added(String date_added) {
            this.date_added = date_added;
        }

        public String getDate_modified() {
            return date_modified;
        }

        public void setDate_modified(String date_modified) {
            this.date_modified = date_modified;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCategory_id() {
            return category_id;
        }

        public void setCategory_id(String category_id) {
            this.category_id = category_id;
        }

        public String getCategory_name() {
            return category_name;
        }

        public void setCategory_name(String category_name) {
            this.category_name = category_name;
        }

        public String getFilter_id() {
            return filter_id;
        }

        public void setFilter_id(String filter_id) {
            this.filter_id = filter_id;
        }

        public String getFilter_name() {
            return filter_name;
        }

        public void setFilter_name(String filter_name) {
            this.filter_name = filter_name;
        }

        public String getManufacturer_name() {
            return manufacturer_name;
        }

        public void setManufacturer_name(String manufacturer_name) {
            this.manufacturer_name = manufacturer_name;
        }

        public List<?> getSpecial() {
            return special;
        }

        public void setSpecial(List<?> special) {
            this.special = special;
        }

        public List<?> getAttributes() {
            return attributes;
        }

        public void setAttributes(List<?> attributes) {
            this.attributes = attributes;
        }

        public List<DiscountsBean> getDiscounts() {
            return discounts;
        }

        public void setDiscounts(List<DiscountsBean> discounts) {
            this.discounts = discounts;
        }

        public List<?> getCategory_ids() {
            return category_ids;
        }

        public void setCategory_ids(List<?> category_ids) {
            this.category_ids = category_ids;
        }

        public List<?> getFilter_ids() {
            return filter_ids;
        }

        public void setFilter_ids(List<?> filter_ids) {
            this.filter_ids = filter_ids;
        }

        public static class DiscountsBean {
            private String product_discount_id;
            private String product_id;
            private String customer_group_id;
            private String quantity;
            private String priority;
            private String price;
            private String date_start;
            private String date_end;

            public String getProduct_discount_id() {
                return product_discount_id;
            }

            public void setProduct_discount_id(String product_discount_id) {
                this.product_discount_id = product_discount_id;
            }

            public String getProduct_id() {
                return product_id;
            }

            public void setProduct_id(String product_id) {
                this.product_id = product_id;
            }

            public String getCustomer_group_id() {
                return customer_group_id;
            }

            public void setCustomer_group_id(String customer_group_id) {
                this.customer_group_id = customer_group_id;
            }

            public String getQuantity() {
                return quantity;
            }

            public void setQuantity(String quantity) {
                this.quantity = quantity;
            }

            public String getPriority() {
                return priority;
            }

            public void setPriority(String priority) {
                this.priority = priority;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getDate_start() {
                return date_start;
            }

            public void setDate_start(String date_start) {
                this.date_start = date_start;
            }

            public String getDate_end() {
                return date_end;
            }

            public void setDate_end(String date_end) {
                this.date_end = date_end;
            }
        }
    }
}
