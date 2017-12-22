(ns pik-logistic-charts.events
  (:require [re-frame.core :as rf]
            [day8.re-frame.http-fx]
            [ajax.core :refer [json-request-format json-response-format]]
            [clojure.set]
            [pik-logistic-charts.db :as db]
            [pik-logistic-charts.util :as util]))


(rf/reg-event-db
  ::init-db
  (fn [_ _]
    (let [date-from (util/today- 30)
          date-to   (util/today)]
      (update-in db/default-db [:filters]
                 merge {:date-from date-from :date-to date-to}))))

