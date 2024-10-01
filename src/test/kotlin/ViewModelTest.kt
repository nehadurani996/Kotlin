import org.example.AnalyticsClient.modelView
import org.junit.jupiter.api.Test
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mockito


class ViewModelTest {
    @Test
    fun `tractEvent() is called when submitClick() is called`() {
        val analytics = Mockito.mock(AnalyticsClient::class.java)
        val modelView = modelView(analytics)

        modelView.submitClick()
        Mockito.verify(analytics).track(anyString())
    }

}