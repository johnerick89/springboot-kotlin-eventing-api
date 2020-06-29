package ada.points.eventing

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.NameTokenizers;
import org.modelmapper.jooq.RecordValueReader;

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class EventingApplication

fun main(args: Array<String>) {
	runApplication<EventingApplication>(*args){
		setBannerMode(Banner.Mode.OFF)
	}
}

@Bean
fun modelMapper(): ModelMapper {
	val mapper = ModelMapper()
	mapper.configuration.setSourceNameTokenizer(NameTokenizers.UNDERSCORE)
			.addValueReader(RecordValueReader())
	return mapper
}
