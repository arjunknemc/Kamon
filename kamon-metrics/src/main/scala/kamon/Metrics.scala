package kamon

import com.codahale.metrics.MetricRegistry
import com.typesafe.config.ConfigFactory
import akka.actor.{ActorRef, ExtendedActorSystem, ExtensionIdProvider, ExtensionId}
import kamon.Kamon.Extension
import akka.actor

object Metrics extends ExtensionId[MetricsExtension] with ExtensionIdProvider {
  def lookup(): ExtensionId[_ <: actor.Extension] = Metrics
  def createExtension(system: ExtendedActorSystem): Extension = new MetricsExtension(system)

}


class MetricsExtension(system: ExtendedActorSystem) extends Kamon.Extension {
  def manager: ActorRef = ???
}




