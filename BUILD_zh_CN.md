# 构建SDC

构建Data Collector，你需要准备如下软件:

- Git 1.9+
- Oracle JDK 8
- Maven 3.3.9+
- Node 0.10.32+1  (macOS, `brew install nodejs`       : Linux, [nodejs.org](https://nodejs.org) or [Packages from NodeSource](https://github.com/nodesource/distributions))
 - npm            (macOS, `brew install nodejs`       : Linux, [nodejs.org](https://nodejs.org) or [Packages from NodeSource](https://github.com/nodesource/distributions))
 - bower 1.8.2    (macOS, `npm -g install bower`      : Linux, `sudo npm -g install bower`)
 - grunt-cli      (macOS, `npm -g install grunt-cli`  : Linux, `sudo npm -g install grunt-cli`)
- md5sum          (macOS, `brew install md5sha1sum`)

## 构建SDC的先决条件

如果你是基于本git master branch构建，那么需要先将API和Plugin API 模块安装至maven cache。按如下步骤操作:

1. `git clone  http://github.com/streamsets/datacollector-api`
2. `cd datacollector-api && git checkout b73fb2529a341d3bd81cf8574579a62b95304c37`
3. `mvn clean install -DskipTests`
4. `git clone http://github.com/streamsets/datacollector-plugin-api`
5. `cd datacollector-plubin-api && git checkout d87e3728768ad672750f9677a0decf36ab0f93a8`
6. `mvn clean install -DskipTests`

然后，获取Data Collector代码

`git clone https://github.com/tianlin/datacollector.git `

## 构建开发环境

在Data Collector目录中，执行

`mvn package -Pdist,ui -DskipTests -DskipRat`

启动Data Collector, 执行

`dist/target/streamsets-datacollector-3.17.0-SNAPSHOT/streamsets-datacollector-3.17.0-SNAPSHOT/bin/streamsets dc`



