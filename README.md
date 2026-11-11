# Java 變數與運算練習

## 執行方式

```
javac -encoding UTF-8 檔名.java
java 類別名稱
```

## 實作一：購物金額計算（Shopping.java）

筆記本 35 元買 3 本、原子筆 12 元買 2 支，付款 200 元，計算總價與找零。

```
javac -encoding UTF-8 Shopping.java
java Shopping
```

| 測試 | 修改 | 預期輸出 |
|---|---|---|
| 一 | 原始資料 | Total: 129 / Change: 71 |
| 二 | 筆記本改成 4 本 | Total: 164 / Change: 36 |
| 三 | 原子筆改成 0 支 | Total: 105 / Change: 95 |

## 實作二：互動式成績計算器（GradeCalculator.java）

輸入作業、期中、期末成績，計算加權總分（作業 20%、期中 30%、期末 50%）。總分至少 60 分為及格，並檢查三項成績是否都在 0–100。

```
javac -encoding UTF-8 GradeCalculator.java
java GradeCalculator
```

依提示輸入三項成績，每輸入一項按 Enter。

| 測試 | 輸入（作業 / 期中 / 期末） | 預期輸出 |
|---|---|---|
| 一 一般案例 | 80 / 70 / 90 | Total: 82.0, Passed: true |
| 二 邊界案例 | 60 / 60 / 60 | Total: 60.0, Passed: true |
| 三 不及格 | 50 / 50 / 50 | Total: 50.0, Passed: false |
| 四 小數案例 | 80.5 / 70 / 90 | Total: 82.1, Passed: true |
| 選做 範圍檢查 | 120 / 70 / 90 | Valid: false |
