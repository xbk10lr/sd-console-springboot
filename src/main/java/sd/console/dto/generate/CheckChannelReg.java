package sd.console.dto.generate;

import java.util.Date;

public class CheckChannelReg {
    private String channelCode;

    private Date checkDate;

    private String checkNbr;

    private String fileName;

    private String checkFlag;

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public String getCheckNbr() {
        return checkNbr;
    }

    public void setCheckNbr(String checkNbr) {
        this.checkNbr = checkNbr == null ? null : checkNbr.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getCheckFlag() {
        return checkFlag;
    }

    public void setCheckFlag(String checkFlag) {
        this.checkFlag = checkFlag == null ? null : checkFlag.trim();
    }
}