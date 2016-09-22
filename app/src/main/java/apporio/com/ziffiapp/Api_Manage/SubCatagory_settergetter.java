package apporio.com.ziffiapp.Api_Manage;

import java.util.List;

/**
 * Created by apporio3 on 9/16/2016.
 */
public class SubCatagory_settergetter {


    /**
     * status : true
     * details : [{"category_id":"201","image":"","parent_id":"200","top":"0","column":"1","sort_order":"0","status":"1","date_added":"2016-09-15 14:01:08","date_modified":"2016-09-15 14:05:03","language_id":"1","name":"Hair Straightening","description":"","meta_title":"Hair Straightening","meta_description":"","meta_keyword":""}]
     */

    private boolean status;
    /**
     * category_id : 201
     * image :
     * parent_id : 200
     * top : 0
     * column : 1
     * sort_order : 0
     * status : 1
     * date_added : 2016-09-15 14:01:08
     * date_modified : 2016-09-15 14:05:03
     * language_id : 1
     * name : Hair Straightening
     * description :
     * meta_title : Hair Straightening
     * meta_description :
     * meta_keyword :
     */

    private List<DetailsBean> details;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<DetailsBean> getDetails() {
        return details;
    }

    public void setDetails(List<DetailsBean> details) {
        this.details = details;
    }

    public static class DetailsBean {
        private String category_id;
        private String image;
        private String parent_id;
        private String top;
        private String column;
        private String sort_order;
        private String status;
        private String date_added;
        private String date_modified;
        private String language_id;
        private String name;
        private String description;
        private String meta_title;
        private String meta_description;
        private String meta_keyword;

        public String getCategory_id() {
            return category_id;
        }

        public void setCategory_id(String category_id) {
            this.category_id = category_id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getParent_id() {
            return parent_id;
        }

        public void setParent_id(String parent_id) {
            this.parent_id = parent_id;
        }

        public String getTop() {
            return top;
        }

        public void setTop(String top) {
            this.top = top;
        }

        public String getColumn() {
            return column;
        }

        public void setColumn(String column) {
            this.column = column;
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

        public String getLanguage_id() {
            return language_id;
        }

        public void setLanguage_id(String language_id) {
            this.language_id = language_id;
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

        public String getMeta_title() {
            return meta_title;
        }

        public void setMeta_title(String meta_title) {
            this.meta_title = meta_title;
        }

        public String getMeta_description() {
            return meta_description;
        }

        public void setMeta_description(String meta_description) {
            this.meta_description = meta_description;
        }

        public String getMeta_keyword() {
            return meta_keyword;
        }

        public void setMeta_keyword(String meta_keyword) {
            this.meta_keyword = meta_keyword;
        }
    }
}
