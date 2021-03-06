package yj.core.crhd.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import yj.core.crhd.dto.Crhd;
import yj.core.crhd.service.ICrhdService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CrhdController extends BaseController {

@Autowired
private ICrhdService service;


@RequestMapping(value = "/sap/crhd/query")
@ResponseBody
public ResponseData query(Crhd dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                          @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
    IRequest requestContext = createRequestContext(request);
    return new ResponseData(service.select(requestContext,dto,page,pageSize));
}

@RequestMapping(value = "/sap/crhd/submit")
@ResponseBody
public ResponseData update(HttpServletRequest request, @RequestBody List<Crhd> dto){
    IRequest requestCtx = createRequestContext(request);
    return new ResponseData(service.batchUpdate(requestCtx, dto));
}

@RequestMapping(value = "/sap/crhd/remove")
@ResponseBody
public ResponseData delete(HttpServletRequest request, @RequestBody List<Crhd> dto){
    service.batchDelete(dto);
    return new ResponseData();
}
}