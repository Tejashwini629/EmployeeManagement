package com.wecodee.EmployeeManagement.responseDTO;

import com.wecodee.EmployeeManagement.constant.ResponseStatusCode;

public class ApiResponse<T> {

        private int status;

        private String message;

        private T data;

        public static <T> ApiResponse<T> success(String message, T data) {
            return new ApiResponse<T>(ResponseStatusCode.SUCCESS, message, data);
        }

        public static <T> ApiResponse<T> failure(String message) {
            return new ApiResponse<T>(ResponseStatusCode.FAILED, message, null);
        }

        public ApiResponse(ResponseStatusCode status, String message, T data) {
            super();
            this.status = status.getStatus();
            this.message = message;
            this.data = data;
        }

        public ApiResponse() {
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

}
