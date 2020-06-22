package com.okay.family.service;

import com.github.pagehelper.PageInfo;
import com.okay.family.common.bean.common.DelBean;
import com.okay.family.common.bean.testcase.CaseRunRecord;
import com.okay.family.common.bean.testcase.request.*;
import com.okay.family.common.bean.testcase.response.CaseDetailBean;
import com.okay.family.common.bean.testcase.response.CaseEditRetrunRecord;
import com.okay.family.common.bean.testcase.response.TestCaseAttributeBean;
import com.okay.family.common.bean.testcase.response.TestCaseListBean;

import java.util.concurrent.CountDownLatch;

public interface ITestCaseService {


    int addCase(EditCaseAttributeBean bean);

    int copyCase(EditCaseAttributeBean bean);

    int updateCase(EditCaseAttributeBean bean);

    int delCase(DelBean bean);

    void addCaseProjectRelation(EditCaseAttributeBean bean);

    void delCaseProjectRelation(DelBean bean);

    void updateCaseProjectRelation(EditCaseAttributeBean bean);

    void copyCaseProjectRelation(int source, int target);

    void addEditRecord(CaseEditRecord record);

    int updateCaseData(CaseDataBean bean);

    PageInfo<TestCaseListBean> searchCases(CaseSearchBean bean);

    TestCaseAttributeBean getAttributeById(int id);

    void getAttributeById(TestCaseAttributeBean bean, CountDownLatch countDownLatch);

    void getCaseProjectRelation(TestCaseAttributeBean bean, CountDownLatch countDownLatch);

    PageInfo<CaseEditRetrunRecord> getCaseEditRecords(CaseEditRecordQueryBean bean);

    CaseDetailBean getCaseDetail(int id);

    CaseRunRecord runCaseData(CaseDataBean bean);

    void addRunRecord(CaseRunRecord runRecord);

}
