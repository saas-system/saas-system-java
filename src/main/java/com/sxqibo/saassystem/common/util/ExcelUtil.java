package com.sxqibo.saassystem.common.util;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.sxqibo.saassystem.common.core.exception.BaseException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

public class ExcelUtil
{
    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelUtil.class);

    /**
     * excel 导出
     *
     * @param list 数据列表
     * @param pojoClass pojo类型
     * @param fileName 导出的Excel名称
     * @param response
     * @param exportParams 导出参数（标题、sheet名称、是否穿件表头、表格类型）
     */
    public static void exportExcel(List<?> list, Class<?> pojoClass, String fileName,
                                   HttpServletResponse  response, ExportParams exportParams)
    {
        Workbook workbook = ExcelExportUtil.exportExcel(exportParams, pojoClass, list);

        downLoadExcel(fileName, response, workbook);
    }

    /**
     * Excel 下载
     *
     * @param fileName 文件名
     * @param response
     * @param workbook Excel数据对象
     */
    private static void downLoadExcel(String fileName, HttpServletResponse response, Workbook workbook)
    {
        ServletOutputStream outputStream = null;
        // 设置文件名和下载方式
        try {
            response.setCharacterEncoding("UTF-8");
            response.setHeader("Content-Disposition",
                    "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));

            outputStream = response.getOutputStream();
            workbook.write(outputStream);
        } catch (IOException e) {
            LOGGER.error("导出 Excel 异常: {}", e.getMessage());
            throw new BaseException("500", "导出 Excel 失败，请联系管理员");
        } finally {
            try {
                outputStream.close();
                workbook.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
