# demo-SpringRESTDocs

1.如何生成adoc文档?

执行下面命令：

```bash
$ mvnw clean test
```

执行测试用例，会在[target/generated-snippets](target/generated-snippets)目录下生成文档。

2.如何生成文档HTML?

执行下面命令:

```bash
$ mvnw clean package 
```

执行打包操作，会在[target/generated-docs](target/generated-docs)目录下生成HTML。