(defproject minato "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [midje "1.10.4"]]
  :plugins [[lein-expectations "0.0.8" :exclusions [org.clojure/clojure]]
            [lein-autoexpect "1.9.0" :exclusions [org.clojure/clojure]]
            [lein-midje "3.2.1" :exclusions [org.clojure/clojure]]
            [lein-kibit "0.1.8"]]
  :main ^:skip-aot minato.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
