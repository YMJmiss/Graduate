package com.example.rjq.myapplication.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by rjq on 2017/12/27.
 */

public class GoodsListBean implements Serializable {
    //商店id
    private int id;
    private String resName;

    private List<GoodsCategoryBean> goodsCategoryList;

    public List<GoodsCategoryBean> getData() {
        return goodsCategoryList;
    }

    public void setData(List<GoodsCategoryBean> data) {
        this.goodsCategoryList = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public static class GoodsCategoryBean {
        private int categoryId;
        private String name;
        private String categoryDescription;
        private int buyNum;
        private List<GoodsItemBean> goodsItemList;

        public GoodsCategoryBean(int id, String name, String categoryDescription, List<GoodsItemBean> goodsItemList) {
            this.categoryId = id;
            this.name = name;
            this.categoryDescription = categoryDescription;
            this.goodsItemList = goodsItemList;
        }

        public int getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(int categoryId) {
            this.categoryId = categoryId;
        }

        public String getCategoryDescription() {
            return categoryDescription;
        }

        public void setCategoryDescription(String categoryDescription) {
            this.categoryDescription = categoryDescription;
        }

        public List<GoodsItemBean> getGoodsItemList() {
            return goodsItemList;
        }

        public void setGoodsItemList(List<GoodsItemBean> goodsItemList) {
            this.goodsItemList = goodsItemList;
        }

        public String getName() {
            return name;
        }

        public int getBuyNum() {
            return buyNum;
        }

        public void setBuyNum(int bugNum) {
            this.buyNum = bugNum;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<GoodsItemBean> getGoodsItem() {
            return goodsItemList;
        }

        public void setGoodsItem(List<GoodsItemBean> goodsitem) {
            this.goodsItemList = goodsitem;
        }

        public static class GoodsItemBean {
            private int id;
            private int categoryId;              //此id就是categoryId，是代码中设置的GoodsCategoryBean中的此id就是categoryId,不是再次通过server端取到的
            private int goodId;       //该商品的id ，唯一标识
            private String name;
            private float price;
            private String introduce;
            private String goodsImgUrl;
            private int monthOrder;
            private int goodComment;
            private int buyNum;

            public GoodsItemBean(int goodId, String name, float price, String introduce, String goodsImgUrl, int monthOrder, int goodComment) {
                this.goodId = goodId;
                this.name = name;
                this.price = price;
                this.introduce = introduce;
                this.goodsImgUrl = goodsImgUrl;
                this.monthOrder = monthOrder;
                this.goodComment = goodComment;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getBuyNum() {
                return buyNum;
            }

            public void setBuyNum(int buyNum) {
                this.buyNum = buyNum;
            }

            public int getGoodComment() {
                return goodComment;
            }

            public void setGoodComment(int goodComment) {
                this.goodComment = goodComment;
            }

            public int getGoodId() {
                return goodId;
            }

            public void setGoodId(int goodId) {
                this.goodId = goodId;
            }

            public int getMonthOrder() {
                return monthOrder;
            }

            public void setMonthOrder(int monthOrder) {
                this.monthOrder = monthOrder;
            }

            public int getCategoryId() {
                return categoryId;
            }

            public void setCategoryId(int categoryId) {
                this.categoryId = categoryId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public float getPrice() {
                return price;
            }

            public void setPrice(float price) {
                this.price = price;
            }

            public String getIntroduce() {
                return introduce;
            }

            public void setIntroduce(String introduce) {
                this.introduce = introduce;
            }

            public String getGoodsImgUrl() {
                return goodsImgUrl;
            }

            public void setGoodsImgUrl(String goodsImgUrl) {
                this.goodsImgUrl = goodsImgUrl;
            }
        }
    }

}