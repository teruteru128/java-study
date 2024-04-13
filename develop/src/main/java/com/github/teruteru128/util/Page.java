package com.github.teruteru128.util;

/**
 * @author Teruteru
 *
 */
public class Page {
    public Page() {
    }

    public Page(long page, long pageSize) {
        if (page < 0) {
            throw new IllegalArgumentException();
        }
        if (pageSize <= 0) {
            throw new IllegalArgumentException();
        }
        this.page = page;
        this.pageSize = pageSize;
    }

    private long page;
    private long pageSize;

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        if (page < 0) {
            throw new IllegalArgumentException();
        }
        this.page = page;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        if (pageSize <= 0) {
            throw new IllegalArgumentException();
        }
        this.pageSize = pageSize;
    }
}
