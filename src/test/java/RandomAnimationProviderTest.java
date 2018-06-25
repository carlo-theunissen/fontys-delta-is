import logic.RandomAnimationProvider;
import models.AnimationModel;
import org.junit.Assert;
import org.junit.Test;
import storage.MemoryStorage;

public class RandomAnimationProviderTest {
    @Test
    public void Basic(){
        RandomAnimationProvider provider = new RandomAnimationProvider(new MemoryStorage());
        Assert.assertNull( provider.getNext() );
    }

    @Test
    public void SingleEntity(){
        RandomAnimationProvider provider = new RandomAnimationProvider(new MemoryStorage());
        AnimationModel model = new AnimationModel();
        Assert.assertNull( provider.getNext() );
        provider.getStorage().PushAnimation(model);
        Assert.assertEquals(model, provider.getNext());
        Assert.assertEquals(model, provider.getNext());
    }

    @Test
    public void DoubleEntity(){
        RandomAnimationProvider provider = new RandomAnimationProvider(new MemoryStorage());
        Assert.assertNull( provider.getNext() );
        provider.getStorage().PushAnimation(new AnimationModel());
        provider.getStorage().PushAnimation(new AnimationModel());

        AnimationModel first = provider.getNext();
        AnimationModel second = provider.getNext();
        Assert.assertNotEquals(first, second);

    }

}
