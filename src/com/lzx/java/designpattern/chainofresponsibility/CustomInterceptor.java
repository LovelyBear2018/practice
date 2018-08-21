package com.lzx.java.designpattern.chainofresponsibility;

/**
 * 类描述：自定义“责任人”
 */
public class CustomInterceptor implements Ratify {
 
     @Override
     public Result deal(Chain chain) {
          Request request = chain.request();
          System.out.println("CustomInterceptor=>" + request.toString());
          String reason = request.reason();
          if (reason != null && reason.equals("事假")) {
              Request newRequest = new Request.Builder().newRequest(request)
                        .setCustomInfo(request.name() + "请的是事假，而且很着急，请领导重视一下")
                        .build();
              System.out.println("CustomInterceptor=>转发请求");
              return chain.proceed(newRequest);
          }
          return new Result(true, "同意请假");
     }
}
